# AI Blog Template

Minimalist blog template built with:

* **Front-end:** HTML, CSS, JavaScript
* **Back-end:** Java (Spring Boot)
* **Database:** MySQL or PostgreSQL
* **Configuração:** `.env` e `config.json`

Este projeto serve como **template reutilizável** para qualquer pessoa criar um blog simples com backend seguro onde **somente o administrador pode editar posts**.

---

# Estrutura do Projeto

```
ai-blog-template

README.md
.gitignore
.env.example
config.json

frontend/
   index.html
   contact.html
   privacy.html
   terms.html

   css/
      style.css

   js/
      script.js

backend/
   pom.xml

   src/main/java/com/aiblog/
      Application.java

      controller/
      service/
      repository/
      model/

database/
   schema.sql
   seed.sql
```

---

# Requisitos

Instale antes de rodar o projeto:

**Obrigatórios**

* Java 17+
* Maven
* MySQL ou PostgreSQL
* Git
* VS Code (ou outro editor)

**Opcional**

* Docker
* NodeJS (não obrigatório, apenas útil para ferramentas)

---

# 1 — Rodar o projeto LOCALMENTE

## 1. Clonar o projeto

```
git clone https://github.com/seuusuario/ai-blog-template.git
cd ai-blog-template
```

---

## 2. Criar o arquivo `.env`

Copie o arquivo de exemplo:

```
cp .env.example .env
```

Edite com seus dados:

```
DB_HOST=localhost
DB_PORT=3306
DB_NAME=blog
DB_USER=root
DB_PASSWORD=sua_senha

ADMIN_USERNAME=admin
ADMIN_PASSWORD=changeme

SERVER_PORT=8080
JWT_SECRET=sua_chave_secreta
```

---

## 3. Criar o banco de dados

Abra o MySQL:

```
CREATE DATABASE blog;
```

Depois rode o arquivo:

```
database/schema.sql
```

Opcional:

```
database/seed.sql
```

Isso cria o usuário admin inicial.

---

## 4. Rodar o backend

Entre na pasta:

```
cd backend
```

Execute:

```
mvn spring-boot:run
```

Servidor inicia em:

```
http://localhost:8080
```

---

## 5. Abrir o Front-end

Abra o arquivo:

```
frontend/index.html
```

ou rode um servidor local:

```
npx serve frontend
```

ou use extensão **Live Server** do VS Code.

O site abrirá no navegador.

---

# 2 — Hospedar o site (OPÇÃO PAGA)

Arquitetura recomendada:

```
Frontend → Vercel / Netlify
Backend → VPS
Database → MySQL cloud
```

### Passo 1 — Banco de dados

Criar banco em:

* DigitalOcean Managed DB
* AWS RDS
* PlanetScale
* Supabase

Importe:

```
database/schema.sql
```

---

### Passo 2 — Backend

Hospedar em VPS:

* DigitalOcean
* AWS EC2
* Linode

Instalar no servidor:

```
Java
Maven
MySQL client
Git
```

Clonar projeto:

```
git clone seu-repositorio
```

Rodar:

```
mvn package
java -jar target/ai-blog.jar
```

Servidor rodará em:

```
http://seu-servidor:8080
```

---

### Passo 3 — Frontend

Suba a pasta:

```
frontend/
```

em:

* Vercel
* Netlify
* Cloudflare Pages

Edite o arquivo JS para apontar para sua API:

```
http://seu-backend.com/posts
```

---

# 3 — Hospedagem GRATUITA

Opção gratuita usando serviços modernos.

Arquitetura:

```
Frontend → Netlify
Backend → Render
Database → Supabase
```

---

## Backend no Render

1. Criar conta no Render
2. Criar **Web Service**
3. Conectar repositório Git
4. Build command:

```
mvn package
```

Start command:

```
java -jar target/ai-blog.jar
```

---

## Banco gratuito

Criar em:

**Supabase**

ou

**Neon PostgreSQL**

Importar:

```
database/schema.sql
```

---

## Frontend

Hospedar em:

**Netlify**

ou

**Vercel**

Arraste apenas a pasta:

```
frontend
```

---

# Como editar o blog

Para criar um post:

Endpoint:

```
POST /admin/create
```

Exemplo de JSON:

```
{
"title":"Meu primeiro post",
"content":"Olá mundo",
"author":"Admin"
}
```

Pode ser enviado usando:

* Postman
* Insomnia
* curl
* painel admin futuro

---

# Como personalizar o blog

Edite:

```
config.json
```

Exemplo:

```
{
"blogName":"Meu Blog",
"blogDescription":"Blog minimalista",
"author":"Yuri"
}
```

---

# Segurança

Boas práticas já aplicadas:

* `.env` fora do Git
* admin único
* API separada
* banco isolado

Recomendado adicionar futuramente:

* JWT authentication
* criptografia BCrypt
* rate limit
* painel admin

---

# Licença

Projeto open-source.
Pode ser modificado e reutilizado livremente.

---

# Contribuição

Pull requests são bem-vindos.
Sugestões e melhorias também.

---

# Futuras melhorias

Possíveis evoluções do projeto:

* painel admin web
* editor Markdown
* upload de imagens
* comentários
* sistema multi-autor
* SEO automático
* integração com IA

---

# Autor

Template criado para desenvolvimento de blogs minimalistas reutilizáveis.
