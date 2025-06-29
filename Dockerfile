# Utilise l'image officielle de Kafka
FROM wurstmeister/kafka:latest

# Copie tes configurations ou scripts personnalisés ici (si besoin)
# COPY config/* /opt/kafka/config/

# Expose les ports nécessaires
EXPOSE 9092

# Commande par défaut pour démarrer Kafka
CMD ["start-kafka.sh"]