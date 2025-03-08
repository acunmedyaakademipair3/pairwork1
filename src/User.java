
public class User {
        private int id;
        private String username;
        private String name;
        private String surname;
        private String email;

        public User(String surname, String email, String name, int id, String username) {
                this.surname = surname;
                this.email = email;
                this.name = name;
                this.id = id;
                this.username = username;
        }

        public User() {

        }

        public int getId() {
        return id;
        }

        public void setId(int id) {
        this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getName() {
        return name;
        }

        public void setName(String name) {
        this.name = name;
        }

        public String getEmail() {
        return email;
        }

        public void setEmail(String email) {
        this.email = email;
        }

        public String getSurname() {
        return surname;
        }

        public void setSurname(String surname) {
        this.surname = surname;
        }
}