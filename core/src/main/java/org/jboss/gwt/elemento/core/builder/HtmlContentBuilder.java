/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.gwt.elemento.core.builder;

import elemental2.dom.HTMLElement;

/** Builder for container-like elements with inner HTML. */
public class HtmlContentBuilder<E extends HTMLElement> extends ElementBuilder<E, HtmlContentBuilder<E>>
        implements HtmlContent<E, HtmlContentBuilder<E>> {

    public HtmlContentBuilder(E element) {
        super(element);
    }

    @Override
    public HtmlContentBuilder<E> that() {
        return this;
    }
}
