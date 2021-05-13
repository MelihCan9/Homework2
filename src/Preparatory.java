public class Preparatory extends Student {

        public int levelOfEnglish;

        public Preparatory(String name, double GPA, int levelOfEnglish){
                this.name = name;
                this.GPA = GPA;
                this.levelOfEnglish = levelOfEnglish;
        }

        @Override
        public double calculateAchievement() { return levelOfEnglish * 10 * GPA; }
}
