rm -r bin # rd bin /s /q
mkdir bin
javac -cp bin -d bin src/util/Data.java
javac -cp bin -d bin src/util/Pessoa.java
javac -cp bin -d bin src/util/Main.java
