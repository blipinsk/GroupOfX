Usage
=====
*For a working implementation of this library see the `sample/` folder.*

Create and use `Group.OfX` (where `X ∈ {Two, Three, Four, ..., Ten}`) just like you would a `Pair` object.

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
