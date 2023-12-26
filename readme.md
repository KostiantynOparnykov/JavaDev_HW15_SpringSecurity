### Module 15 homework "Spring Security"

This is homework for Module 15 of JavaDeveloper (14) GoIt course

The task, and what have been done:
- added `Spring Security" module
- set default user in `application.properties`(login `user`, password `default`)
- Change authentication in the project by using JDBC. Add a migration that would create a user `user` with the password `jdbcDefault` 
(plus I add user `admin` pass `admin`, user and admin have different param `role`(for future authorization..))

As in previous HW, our app can be reached [http://localhost:8080/note/list](http://localhost:8080/note/list)
or from index page [http://localhost:8080](http://localhost:8080)

All credentials are:

| Login | Password |
|-------|----------|
| admin | admin    |
| user  | jdbcDefault |