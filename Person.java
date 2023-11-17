public class Person {
        int id;
        String name;
        int age;
        private boolean parentPermission;
        public Person(int age, boolean parentPermission, String name) {
            this.age = age;
            this.name = name;
            this.id = 0; // Set id to a default value
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private boolean ofAge() {
            return age >= 18;
        }

        public boolean canUseServices() {
            return ofAge() || parentPermission;
        }
    }

