# What is a Server?

A server is a computer or system where our backend code runs.

When we create a backend application, we usually need to:

- Deploy the backend code on a server
- Manage server storage
- Handle traffic and scaling
- Configure RAM and CPU
- Maintain the server infrastructure

All these responsibilities are handled by us.  
This is called a **Server-based architecture**.

Example: Running backend code on an EC2 instance in AWS.

---

# What is Serverless?

In Serverless architecture, we do not need to manage the server infrastructure.

We only write and deploy the backend code.  
The cloud provider automatically manages:

- Server configuration
- Scaling
- Storage management
- Traffic handling
- RAM and CPU allocation

This is called **Serverless architecture**.

---

# AWS Billing Types

AWS mainly provides two types of billing for backend applications:

## 1. Per Hour Billing

- The server runs continuously (24/7)
- Billing is based on running time
- Example: EC2 instance

Even if no user is using the application, the server is still running and charges continue.

---

## 2. Per Invocation Billing

- The backend code runs only when an API request is received
- If no request comes, the code stays in sleep/inactive state
- Billing is based on the number of requests (invocations)

Example: AWS Lambda

This model is cost-effective for applications with low or variable traffic.
