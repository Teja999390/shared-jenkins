def call() {
sh 'rsync -azh /var/lib/jenkins/  /backup-$(date +%F-%M-%m)'
}
