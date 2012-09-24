CLUJA
=====

Let's try using Clojure 1.4 and Rootbeer to map a pure function over a sequence in parallel on a CUDA GPU.

Functional languages and pure functions lend themselves to simple parallelism.
GPUs contain large numbers of simple Cores.

What doors would be opened if Clojure developers were able to run the
parallel parts of their programs on their GPU ?

Is this practical ?

CLUJA aims to investigate this space and return with some answers.


Enjoy :-)

Build Instructions:
===================

git clone https://github.com/pcpratts/rootbeer1.git
git clone git://github.com/JulesGosnell/cluja.git
cp cluja/rootbeer.pom.xml rootbeer1/
cd rootbeer1
mvn install:install-file -Dfile=lib/sootclasses-2.5.0.jar -DgroupId=soot -DartifactId=soot -Dversion=2.5.0 -Dpackaging=jar
mvn install:install-file -Dfile=lib/jasminclasses-2.5.0.jar -DgroupId=soot -DartifactId=jasmin -Dversion=2.5.0 -Dpackaging=jar
mvn install:install-file -Dfile=lib/polyglotclasses-1.3.5.jar -DgroupId=soot -DartifactId=polyglot -Dversion=1.3.5 -Dpackaging=jar
mvn install:install-file -Dfile=lib/pack.jar -DgroupId=pack -DartifactId=pack -Dversion=1.0 -Dpackaging=jar
mvn install:install-file -Dfile=lib/AXMLPrinter2.jar -DgroupId=axmlprinter -DartifactId=axmlprinter -Dversion=2.0 -Dpackaging=jar
mvn install
cd ../cluja
mvn install

This final step breaks at the moment - CLUJA's aim is to fix it...
