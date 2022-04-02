FROM hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

WORKDIR /tmp

COPY bin/ .

ENTRYPOINT ["sbt"]

CMD ["clean", "compile", "package", "run"]

# CMD ["/usr/bin/scala", "/tmp/target/scala-2.13/user-svc_2.13-0.0.1-SNAPSHOT.jar"]
