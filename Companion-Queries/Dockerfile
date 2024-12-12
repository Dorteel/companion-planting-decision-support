FROM openjdk:17
WORKDIR '/Companion-Queries'
COPY target/companion-0.0.1-SNAPSHOT.jar app.jar
COPY companion_planting_ontology.owl companion_planting_ontology.owl
ENTRYPOINT ["java","-jar","/app.jar"]
