# scala-locales-demo

Small sample application using [scalajs-locales](https://github.com/cquiroz/scalajs-locales)

To build call

```
sbt fastOptJS
```

or

```
sbt fullOptJS
```

and open `index.html` or `index-opt.html`

# Time/Size measurements

Measured with the command

```
 time for i in {1..10}; do sbt clean fastOptJS; done
 time for i in {1..10}; do sbt clean fullOptJS; done
```
measurements: avg time/size in bytes

* version 0.1.0:
  * fastOptJS: 28.1s/3748206
  * fullOptJS: 95s/990191