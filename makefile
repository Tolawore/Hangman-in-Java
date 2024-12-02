all: compile run

compile:
	javac Main.java Hangman.java

run:
	java Main

clean:
	rm *.class
