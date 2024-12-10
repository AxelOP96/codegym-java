MyFile file = new MyFile();
file.initialize("c:\\data\\a.text");

MyFile file2 = new MyFile();
file2.initialize(file, "a.txt");
String text = file2.readText();
