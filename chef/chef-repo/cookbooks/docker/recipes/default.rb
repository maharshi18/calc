# docker_service 'default' do
# 	action [:create, :start]
# end

docker_installation_package 'default' do
  version '19.03.8'
#   package_version 'bionic'
  action :create
#   package_options %q|--force-yes -o Dpkg::Options::='--force-confold' -o Dpkg::Options::='--force-all'| # if Ubuntu for example
end

# docker_installation_script 'default' do
#   repo 'main'
#   script_url 'https://get.docker.com -o get-docker.sh'
#   action :create
# end

# docker_service 'default' do
# 	action [:create, :start]
# end

