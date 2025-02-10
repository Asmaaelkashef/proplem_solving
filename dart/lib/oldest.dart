import 'dart:io';

void main() {
  print(
      "hello ! iam a small program to define which of you are the biggest ! \n How many of you ?");
  var person = stdin.readLineSync();
  int number = int.parse(person!);
  List ages = [];
  List names = [];

  //function to ask user to enter name and age
  fun_todo() {
    print("enter your name : ");
    var name = stdin.readLineSync();
    names.add(name);
    print("hello $name , what is your birth year ?");
    var year = stdin.readLineSync();
    int age = DateTime.now().year - int.parse(year!);
    ages.add(age);
  }

  for (int i = 0; i < number; i++) {
    fun_todo();
  }
  int biggest = ages[0];
  String oldest_person = names[0];

  //define the oldest
  for (int i = 0; i < ages.length; i++) {
      if (biggest < ages[i]) {
        biggest = ages[i];
        oldest_person = names[i];
        }
    }
  
  print(
      "your ages are $ages , and the oldest person among of you is $oldest_person and have $biggest years !");
}
