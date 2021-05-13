public class Administrative extends Personal {

        public Administrative(String name, int birthYear, String department){
                this.name = name;
                this.birthYear = birthYear;
                this.department = department;
        }

        @Override
        public double calculateAchievement(){ return 0; }
}
