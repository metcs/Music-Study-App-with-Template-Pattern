<h1>Music Theory Quiz</h2>
<p> This application asks the user randomly-chosen, and randomly generated, music theory questions.
The questions themselves are constructed out of different question templates with the 
details filled in at random.  The user's answer is checked against the correct answer and 
feedback is given to the user to indicate if their answer was correct.</p>
<h2>Implementation Details</h3>
<p>The main difficulty of this application is in generating the questions and answers with random values.  I have chosen to use 
the template design pattern to help with the creation of these complex objects.  In the case of all questions, there is a sequence 
of steps that occurs in the object creation.  There is the generation of random values, appropriate to the type of question being generated,
there is the insertion of those values into the proper place in the question template, and the computation of the answer based on the 
specific, randomly-generated values.  The template pattern allows me to define these steps in the abstract base class and then leave 
the details of the question implementation to the concrete subclasses.  The other issue is in randomly picking from among these 
concrete question subclasses.  To help with this, I created a question factory that takes a number that maps to an instance of one   
of these concrete question classes.  The flow of the generation of these questions, then, is to randomly generate a number in the  
main method between 0 and one less than the number of concrete question classes I have, pass that random number to my question factory,  
use the question factory to select a concrete question class, use the abstract question class to call the steps necessary to create the 
question instances, instantiate a concrete question, and return this instance back to the main.</p>

<h3>Main Software Design Goals</h3>
<ul>
	<li>
		Understandability:  Because the steps to question creation are clearly defined inside the abstract base class,
		it is fairly easy to see how questions are constructed.
	</li>
	<li>
		Modularity: The question classes are highly modular and can be added and removed without affecting the other code
	</li>
	<li>
		Cohesion: Question functionality remains together.
	</li>
	<li>
		Reusability:  The generation of question objects could be reused easily in other applications.
	</li>
</ul>

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run


```bash
java -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

or


```bash
run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
