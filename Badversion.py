def isBadVersion(version):
  bad = 4
  if version >= bad:
      return True
  else:
      return False

def checkVersion(version):
  if isBadVersion(version):
      print("Version {} is considered bad.".format(version))
  else:
      print("Version {} is considered good.".format(version))


version_to_check = int(input("Enter the version number to check: "))
checkVersion(version_to_check)
