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
