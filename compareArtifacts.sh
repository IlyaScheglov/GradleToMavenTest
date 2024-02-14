#!/bin/bash
MAVEN=target/MavenToGradle-0.0.1-SNAPSHOT.jar
GRADLE=build/libs/MavenToGradle-0.0.1-SNAPSHOT.jar
ls -1 --block-size=M $MAVEN | awk '{print $9, $5}'
ls -1 --block-size=M $GRADLE | awk '{print $9, $5}'