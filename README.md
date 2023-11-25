# microhttp-setcookie

Utility for producing a Set-Cookie header

## Dependency Information

### Maven

```xml
<dependency>
    <groupId>dev.mccue</groupId>
    <artiactId>microhttp-setcookie</artiactId>
    <version>0.0.1</version>
</dependency>
```

### Gradle

```groovy
dependencies {
    implementation('dev.mccue:microhttp-setcookie:0.0.1')
}
```

## Usage

```java
Header header = SetCookieHeader.of("name", "value");
Header otherHeader = SetCookieHeader.builder("name2", "value2")
        .sameSite(SameSite.STRICT)
        .secure(true)
        .build();
```