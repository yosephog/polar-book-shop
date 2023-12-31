plugins {
	java
	id("org.springframework.boot") version "3.1.1"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.polar"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

extra["springCloudVersion"] = "2022.0.3"
ext {
	set("testcontainersVersion", "1.17.3")
}
dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.testcontainers:postgresql")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.cloud:spring-cloud-starter-config")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
	// https://mvnrepository.com/artifact/javax.persistence/javax.persistence-api
	implementation("javax.persistence:javax.persistence-api:2.2")
	// https://mvnrepository.com/artifact/javax.validation/validation-api
	implementation("javax.validation:validation-api:2.0.1.Final")
	implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")
	implementation("org.flywaydb:flyway-core")
	// https://mvnrepository.com/artifact/org.hibernate/hibernate-validator
	implementation("org.hibernate:hibernate-validator:8.0.1.Final")


}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
		mavenBom("org.testcontainers:testcontainers-bom:${property("testcontainersVersion")}")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
