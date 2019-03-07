.PHONY: all build clean

all: build

run:
	mvn exec:java -Dexec.mainClass="edu.research.ksm.App"

build:
	mvn compile

clean:
	mvn clean
