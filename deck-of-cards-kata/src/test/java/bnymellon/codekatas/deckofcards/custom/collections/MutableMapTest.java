/*
 * Copyright 2020 The Bank of New York Mellon.
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

package bnymellon.codekatas.deckofcards.custom.collections;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MutableMapTest
{
    @Test
    public void of()
    {
        Assertions.assertEquals(Map.of(1, "1"), MutableMap.of(1, "1"));
        MutableMap<Integer, String> map = MutableMap.of(1, "1", 2, "2");
        Map<Integer, String> expected = Map.of(1, "1", 2, "2");
        Assertions.assertEquals(expected, map);
    }
}