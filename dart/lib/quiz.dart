import 'dart:io';

class MathQuestions {
  String question;
  double answer;
  MathQuestions({
    required this.question,
    required this.answer,
  });
}

double getanswer(String msg) {
  print("Q : $msg ?");
  var answer = double.parse(stdin.readLineSync()!);
  return answer;
}

void main() {
  var questions = [
    MathQuestions(question: "4 + 5", answer: 9.00),
    MathQuestions(question: "8 * 100", answer: 800.00),
    MathQuestions(question: "100 / 5", answer: 20.00),
    MathQuestions(question: "300 - 40", answer: 260.00),
    MathQuestions(question: "1000 / 100", answer: 10.00),
  ];
  
  for (var i in questions) {
    var useranswer = getanswer(i.question);
    if (useranswer == i.answer){print(" well done ! its true answer");} else {print("false ! answer is ${i.answer}");}
    print("_________________");
  }
}
