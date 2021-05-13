public class Academic extends Personal{

        public int numberOfPaper;
        public int numberOfSymposium;

        public Academic(String name, int birthYear, String department, int numberOfPaper, int numberOfSymposium){
                this.name = name;
                this.birthYear = birthYear;
                this.department = department;
                this.numberOfPaper = numberOfPaper;
                this.numberOfSymposium = numberOfSymposium;
        }

        @Override
        public double calculateAchievement(){

                int age = 2021-birthYear;

                return (double) ((3 * numberOfPaper) + (2 * numberOfSymposium)) /age;
        }
}
