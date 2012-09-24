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
mvn install
cd ../cluja
mvn install
