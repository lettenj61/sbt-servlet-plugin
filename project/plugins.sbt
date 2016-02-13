libraryDependencies <+= sbtVersion(v => "org.scala-sbt" % "scripted-plugin" % v)

addSbtPlugin("com.typesafe.sbt"     % "sbt-scalariform"      % "1.3.0")
addSbtPlugin("com.github.mpeltonen" % "sbt-idea"             % "1.6.0")
addSbtPlugin("com.jsuereth"         % "sbt-pgp"              % "1.0.0")
addSbtPlugin("com.timushev.sbt"     % "sbt-updates"          % "0.1.10")
addSbtPlugin("net.virtual-void"     % "sbt-dependency-graph" % "0.8.2")
addSbtPlugin("org.xerial.sbt"       % "sbt-sonatype"         % "1.0")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
