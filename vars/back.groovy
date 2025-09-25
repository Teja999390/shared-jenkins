def call() {
  sh 'useradd jenkins'
  sh 'mkdir -p /home/jenkins/backup'
  sh 'rsync -azh /var/lib/jenkins/  /home/jenkins/backup-$(date +%F-%M-%m)'
}
