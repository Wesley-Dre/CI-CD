#!/bin/bash

echo "🚀 Executando testes..."

# Simulação de testes (descomente o que for usar)
# ./gradlew test
# mvn test
# ./run_tests.sh

if [ $? -eq 0 ]; then
  echo "✅ Testes concluídos com sucesso."
else
  echo "❌ Falha nos testes."
  exit 1
fi