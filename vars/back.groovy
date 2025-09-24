def call() {
mkdir -p /backup
rsync -azh /var/lib/jenkins/ '/backup-$(date +%F-%M-%m)'
}
