# ft_lct2
Начало работы с Git

Чтобы запустить проект из консоли надо:
1) добавить maven и JAVA_HOME в переменную окружения PATH (то есть .../maven/bin и .../Java/jdk-10.0.2 (моя версия JDK))
2) посмотреть, работает ли mvn -v (у меня версия 3.5.4)
3) собрать проект mvn compile
4) запустить проект: mvn exec:java -Dexec.mainClass="GenFold"
