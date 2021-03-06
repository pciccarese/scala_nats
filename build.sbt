scalaVersion := "2.11.8"
version := "0.2.1"
crossScalaVersions := List("2.11.8")
name := "scala_nats"
organization := "com.github.tyagihas"
description := "scala_nats"

publishMavenStyle := true
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.11.8"
libraryDependencies += "com.github.tyagihas" % "java_nats" % "0.6.1"
publishArtifact in Test := false

lazy val root = (project in file(".")).
  settings(
    name := "scala_nats",
    version := "0.2.1",
    scalaVersion := "2.11.8"
)

resolvers += "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
resolvers += "Sonatype release Repository" at "http://oss.sonatype.org/service/local/staging/deploy/maven2/"
resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
    
pomExtra := (
<url>https://github.com/tyagihas/scala_nats</url>
<licenses>
	<license>
                <name>The MIT License</name>
                <url>http://www.opensource.org/licenses/mit-license.php</url>
                <distribution>repo</distribution>
            </license>
</licenses>
<scm>
	<connection>scm:git:git@github.com:tyagihas/scala_nats.git</connection>
	<developerConnection>scm:git:git@github.com:tyagihas/scala_nats.git</developerConnection>
	<url>git@github.com:tyagihas/scala_nats.git</url>
</scm>
<developers>
	<developer>
		<id>tyagihas</id>
		<name>Teppei Yagihashi</name>
		<url>https://github.com/tyagihas</url>
	</developer>
</developers>
)
