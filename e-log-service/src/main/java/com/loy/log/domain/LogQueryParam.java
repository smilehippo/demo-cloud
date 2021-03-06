/*
 * Copyright   Loy Fu. 付厚俊
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.loy.log.domain;

import com.loy.e.core.query.annotation.ConditionParam;
import com.loy.e.core.query.data.Op;
import com.loy.e.core.query.data.SortQueryParam;

import com.loy.e.common.annotation.Author;

@Author(author = "Loy Fu", website = "http://www.17jee.com", contact = "qq群 540553957")
public class LogQueryParam extends SortQueryParam {

    @ConditionParam(name = "operator", op = Op.like)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
