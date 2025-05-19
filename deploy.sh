#!/bin/bash

echo "🔁 Iniciando deploy local..."

# Navegar até o diretório da aplicação
cd /c/Users/vaio/CICD/CICD

# Puxar as últimas alterações do repositório
git pull origin main

# Opcional: Parar o serviço da aplicação
# systemctl stop nome-do-serviço

# Compilar e/ou iniciar a aplicação (dependendo do tipo de aplicação)
# ./build.sh
# ./start.sh
# systemctl start nome-do-serviço

echo "✅ Deploy concluído com sucesso."
