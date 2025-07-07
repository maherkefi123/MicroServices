#!/bin/bash

# Utilisation d'une variable d'environnement
if [ -z "$GITHUB_TOKEN" ]; then
  echo "Erreur : GITHUB_TOKEN n'est pas défini."
  exit 1
fi

./mvnw spring-boot:run