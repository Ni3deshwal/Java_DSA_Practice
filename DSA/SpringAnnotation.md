# 🧩 Spring Core Annotations: `@Component`, `@Bean`, `@Configuration`

---

## 🔹 `@Component`

- It is a **class-level annotation**.
- When we use this annotation, Spring performs the following steps:

### ✅ What Spring Does:

1. **Find the Class**  
   Spring scans the application to find classes marked with `@Component`.

2. **Create an Object**  
   Spring creates an object (bean) of the class automatically without requiring explicit code.

3. **Handle Dependencies**  
   If the class needs other objects (dependencies), Spring injects them automatically.

4. **Inject the Bean**  
   Spring injects the created bean wherever it's needed in the application using annotations like `@Autowired`.

---

## 🔸 `@Bean`

- It is a **method-level annotation**.
- It allows us to define and configure beans **manually**, rather than relying on Spring to detect them automatically.

### ✅ Key Points:

1. **Explicit Bean Creation**  
   Write methods with `@Bean` inside a class annotated with `@Configuration` to define beans manually.

2. **Lifecycle Management**  
   Spring manages the lifecycle of these beans and handles dependencies just like with `@Component`.

---

## 🟨 `@Configuration`

- It is a **class-level annotation**.
- It marks a class as a **source of bean definitions**.

### ✅ How It Works:

1. **Bean Declaration Point**  
   The class tells Spring that it defines beans via `@Bean` annotated methods.

2. **Automatic Processing**  
   Spring processes this class and registers all the beans declared inside it.

3. **Singleton Behavior**  
   Each `@Bean` method is called only once — Spring returns the **same instance every time** (singleton scope by default).

## 🟨 `@Controller`
   Controller is a specialized version of @Component desigined specially for handling web request in Spring MVC method using(e.g @requestMapping,@getMapping,etc)
   It is also handle view resolution(returning html page or template)


## 🟨 `@RestController`
   It is a specialized version of @Controller designed for restful api.
   It combine the behavior of @Controller and @ResponseBody.
   You dont't need to each method annotated with @ResponseBody to return data like JSON.
   Use @RestController when building REST APIs  that return data (JSON,XML,etc) directly instead of view(html pages)

## 🟨 `@Service`
   It is a specialization of @Component.
   It's intended to indicate that the class provide some business logic with in the application.
   Using @Service helps clarify the intent of the class for developers and align with the good practice code for the organization.
   In short using @Component instead of @Service will work the same but it is more meaningful to use @Service to indicate that the class provide service or         business logic

## 🟨 `@Repository`
   It is a specialization of @Component intended specially for data access layer(DAO) classes that interact with database.
   One of the primary role of @Repository is to provide a machanism for translating data related exception into Spring's data hierachy.
   It reduce complexity of error handling and make code the more readable and maintainable.
   
