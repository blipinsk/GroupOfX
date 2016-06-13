GroupOfX
=======

When Android's Pair class is just not enough.

I use Android's Pair class quite often, but sometimes packing two objects is just not enough.

Usage
=====
*For a working implementation of this library see the `sample/` folder.*

Create and use `Group.OfX` (where `X∈{2, 3, 4, ..., 10}`) just like you would a `Pair` object.
  
  ```java
  Group.OfFour<String, Integer, String, String> aGroupOfFour =
        new Group.OfFour<>("first part", 2, "third", "and a fourth one.");
  ```

Including In Your Project
-------------------------
You can grab the library via Maven Central. Just add a proper dependency inside your `build.gradle`. Like this:

```xml
dependencies {
    compile 'com.bartoszlipinski:groupofx:1.0.0'
}
```

Developed by
============
 * Bartosz Lipinski

License
=======

    Copyright 2016 Bartosz Lipiński
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
