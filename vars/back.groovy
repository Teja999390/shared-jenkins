def call() {
sh 'mkdir -p /var/backup'
sh 'rsync -azh /var/lib/jenkins/  /backup-$(date +%F-%M-%m)'
}
