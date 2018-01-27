/*
 * Copyright 2016-2018 David Karnok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package hu.akarnokd.rxjava2.string;

import org.junit.Test;

import hu.akarnokd.rxjava2.test.BaseTest;

public class StringObservableTest extends BaseTest {

    @Test
    public void characters() {
        assertResult(StringObservable.characters("abcdef"), 97, 98, 99, 100, 101, 102);
    }
}
