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

package hu.akarnokd.rxjava2.basetypes;

import java.util.concurrent.Callable;

import org.reactivestreams.Subscriber;

import io.reactivex.internal.subscriptions.EmptySubscription;

/**
 * Completes the subscriber immediately.
 */
final class NonoComplete extends Nono implements Callable<Void> {

    static final NonoComplete INSTANCE = new NonoComplete();

    @Override
    protected void subscribeActual(Subscriber<? super Void> s) {
        EmptySubscription.complete(s);
    }

    @Override
    public Void call() throws Exception {
        return null;
    }
}
