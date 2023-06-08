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

import build.buf.protovalidate.errors.ValidationError;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.Message;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class MessageEvaluatorImpl implements MessageEvaluator {

    // Err stores if there was a compilation error constructing this evaluator.
    // It is cached here so that it can be stored in the registry's lookup table.
    private Exception err;

    // evaluators are the individual evaluators that are applied to a message.
    private MessageEvaluators evaluators;

    public MessageEvaluatorImpl() {
        this.evaluators = new MessageEvaluators(Collections.emptyList());
    }
    public MessageEvaluatorImpl(List<MessageEvaluator> messageEvaluators) {
        this.evaluators = new MessageEvaluators(messageEvaluators);
    }

    @Override
    public boolean tautology() {
        return this.err == null && this.evaluators.tautology();
    }

    @Override
    public void evaluate(DynamicMessage val, boolean failFast) throws ValidationError {
        evaluateMessage(val, failFast);
    }

    @Override
    public void append(Evaluator eval) {

    }

    @Override
    public void evaluateMessage(Message val, boolean failFast) throws ValidationError {
        this.evaluators.evaluateMessage(val, failFast);
    }

    public void append(MessageEvaluator eval) {
        if (eval != null && !eval.tautology()) {
            this.evaluators.append(eval);
        }
    }
}
