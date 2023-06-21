// Copyright 2023 Buf Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buf.protovalidate.evaluator;

import build.buf.protovalidate.ValidationResult;

import java.util.ArrayList;

public class Value implements Evaluator {
    // Zero is the default or zero-value for this value's type
    public Object zero;
    // Constraints are the individual evaluators applied to a value
    public final Evaluators constraints;
    // IgnoreEmpty indicates that the Constraints should not be applied if the
    // field is unset or the default (typically zero) value.
    public boolean ignoreEmpty;

    public Value() {
        this(false);
    }

    public Value(boolean ignoreEmpty) {
        this.zero = null;
        this.ignoreEmpty = ignoreEmpty;
        this.constraints = new Evaluators(new ArrayList<>());
    }

    @Override
    public boolean tautology() {
        return constraints.evaluators.isEmpty();
    }

    @Override
    public ValidationResult evaluate(JavaValue val, boolean failFast) {
        if (ignoreEmpty && isZero(val)) {
            return ValidationResult.success();
        }
        ValidationResult validationResult = constraints.evaluate(val, failFast);
        if (validationResult.isFailure()) {
            return validationResult;
        }
        return ValidationResult.success();
    }

    private boolean isZero(JavaValue val) {
        if (val == null) {
            return false;
        } else if (zero == null) {
            return val.value() == null;
        }
        return zero.equals(val.value());
    }

    public void append(Evaluator eval) {
        if (eval != null && !eval.tautology()) {
            this.constraints.append(eval);
        }
    }
}