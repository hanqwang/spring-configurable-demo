# spring-configurable-demo

Shows how to use Spring's `@Configurable` annotation to inject dependencies into unmanaged objects. Using Spring Boot.

## With load-time weaving

I was able to use this demo to show that the load-time weaving doesn't always work. (See the
`demo-java-config-w-ltw-doesnt-work` Git tag.) In this case, we're loading the `User` class before instantiating the
load-time weaver, which means that we never weave `User` and the dependency injection into `User` never occurs.

Here are some references:

- http://stackoverflow.com/questions/23445013/aspectj-load-time-weaving-not-working-for-spring-beans
- http://stackoverflow.com/questions/24047647/eagerly-loaded-spring-beans-are-preventing-load-time-weaving
- http://stackoverflow.com/questions/22342526/aspectj-load-time-weaving-not-working-on-spring-beans
- http://stackoverflow.com/questions/19857267/unable-to-apply-advice-to-third-party-library-log4g-logger-getlogger-call-us
- http://forum.spring.io/forum/spring-projects/aop/123993-enableloadtimeweaving-is-not-working-but-context-load-time-weaver-is-worked

## With compile-time weaving

This one hits a different snag. Lombok doesn't know how to work with the AspectJ compiler, and so Lombok disables
itself. The injection works fine but no Lombok. :-/

See

- http://stackoverflow.com/questions/25903686/lombok-does-not-work-with-aspectj

## Conclusion

:-/
