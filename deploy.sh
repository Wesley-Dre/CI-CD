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

      - name: Instalar sshpass
        run: sudo apt-get update && sudo apt-get install -y sshpass

      - name: Executar script remoto via senha
        env:
          SSH_PASS: 459900
        run: |
          sshpass -p "$SSH_PASS" ssh -o StrictHostKeyChecking=no vaio@192.168.1.36 'powershell -Command "
            Write-Host 🔁 Iniciando deploy no servidor remoto...;
            Set-Location C:\Users\VAIO\CICD\CICD;
            git pull origin main;
            Write-Host ✅ Deploy concluído com sucesso."'
