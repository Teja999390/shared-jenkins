def call() {
  sh 'mkdir -p /home/ec2-user/backup'
sh 'rsync -azh /var/lib/jenkins/  /home/ec2-user/backup-$(date +%F-%M-%m)'
}
