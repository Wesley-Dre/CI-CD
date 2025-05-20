name: Deploy via SSH

on:
  push:
    branches:
      - main

jobs:
  deploy:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout do código
        uses: actions/checkout@v3

      - name: Configurar chave SSH
        run: |
          mkdir -p ~/.ssh
          echo "${{ secrets.SSH_PRIVATE_KEY }}" > ~/.ssh/id_rsa
          chmod 600 ~/.ssh/id_rsa
          ssh-keyscan your.server.com >> ~/.ssh/known_hosts

      - name: Executar script remoto
        run: |
          ssh -i ~/.ssh/id_rsa user@your.server.com 'bash -s' << 'EOF'
          echo "🔁 Iniciando deploy no servidor remoto..."
          cd /caminho/para/sua/aplicacao || exit 1
          git pull origin main || exit 1
          echo "✅ Deploy concluído com sucesso."
          EOF
