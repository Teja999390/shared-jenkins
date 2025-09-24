def call() {
sh 'mkdir -p /backup'
sh 'rsync -azh /var/lib/jenkins/  /backup-$(date +%F-%M-%m)'
}
