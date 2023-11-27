// Дана строка sql-запроса:

// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

// Пример:

// {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

// String QUERY - начало SQL-запроса
// String PARAMS - JSON с параметрами

package Seminar2.HomeworkSem2;

class Answer {  
    public StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < QUERY.length(); i++) {
            str.append(QUERY.charAt(i));
        }
        int country = 0;
        String strSmallFirst = "", strSmallSecond = "", strNull = "\'null\'";
        for (int i = 0; i < PARAMS.length(); i++) {
            if (PARAMS.charAt(i) != '{' && PARAMS.charAt(i) != '}'){
                    while (PARAMS.charAt(i) != ':' && i < PARAMS.length() - 1) {
                        if (PARAMS.charAt(i) != '\"') strSmallFirst += PARAMS.charAt(i);
                        i++;
                    }
                    if (PARAMS.charAt(i) == ':') i++;
                    while (PARAMS.charAt(i) != ',' && PARAMS.charAt(i) != ':' && PARAMS.charAt(i) != '{' && PARAMS.charAt(i) != '}' && i < PARAMS.length() - 1) {
                        if (PARAMS.charAt(i) != '\"') strSmallSecond += PARAMS.charAt(i);
                        else strSmallSecond += "\'";
                        i++;
                    }
                    if (i < PARAMS.length() - 1){
                        if (!strSmallSecond.equals(strNull)){
                            if (country != 0) str.append(" and ");
                            str.append(strSmallFirst);
                            str.append("=");
                            str.append(strSmallSecond);
                            country++;
                    }
                    }
                    strSmallFirst = "";
                    strSmallSecond = "";
                }
                i++;
        }
        return str;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Problem1{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}