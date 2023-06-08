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

package build.buf.protovalidate.expression;

import build.buf.validate.Constraint;

// Expression is the read-only interface of either validate.Constraint or
// private.Constraint which can be the source of a CEL expression.
public class Expression {
    public final String id;
    public final String message;
    public final String expression;

    public Expression(String id, String message, String expression) {
        this.id = id;
        this.message = message;
        this.expression = expression;
    }

    public Expression(Constraint constraint) {
        this(constraint.getId(), constraint.getMessage(), constraint.getExpression());
    }
}