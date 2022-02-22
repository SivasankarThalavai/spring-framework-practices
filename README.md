# spring-framework-practices

1. Creating a maven project

	mvn archetype:generate -DgroupId=com.sivasankar.springcore -DartifactId=spring-core-practices  -Dpackage=com.sivasankar.springcore.practices  -Dversion=1.0-SNAPSHOT

2. Build the Maven Project

	> cd simple-maven-project
	> mvn install

3. Run Packaged JAR

	java -cp target/spring-core-practices-1.0-SNAPSHOT.jar com.sivasankar.springcore.practices.App
