﻿using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;

using ProntoTool.Model.Tool;

namespace ProntoTool.Model.Actualization
{
	/// <summary>
	/// The <see cref="BackupJob"/> struct represents a job-dataclass that contains relevant information to start the backup process.
	/// </summary>
	[DebuggerDisplay("{" + nameof(GetDebuggerDisplay) + "(),nq}")]
	public struct BackupJob : IJob
	{

		/// <summary> 
		/// The <see cref="IList{T}"/> of <see cref="DirectoryInfo"/> that contains the target workstations of the update.
		/// </summary>
		public readonly IList<DirectoryInfo> Workstations;

		/// <summary> 
		/// The <see cref="IDictionary{TKey, TValue}"/> of <see cref="DirectoryInfo"/> that contains the target workstations with their backup folders.
		/// </summary>
		public readonly IDictionary<DirectoryInfo, DirectoryInfo> BackupFolders;

		/// <summary> 
		/// The <see cref="IList{T}"/> of <see cref="FileInfo"/> that contains the files of the workstations, that will be affected by updating.
		/// </summary>
		public readonly IDictionary<DirectoryInfo, List<FileInfo>> AffectedFiles;



		/// <summary>
		/// Standard constructor, which initalizes a new instance of <see cref="BackupJob"/> and sets all the necessary attributes. 
		/// </summary>
		/// <param name="workstations"> The <see cref="IList{T}"/> of <see cref="DirectoryInfo"/> that contains the target workstations of the update. </param>
		/// <param name="backupFolders"> The <see cref="IDictionary{TKey, TValue}"/> of <see cref="DirectoryInfo"/> that contains the target workstations with their backup folders. </param>
		/// <param name="affectedFiles"> The <see cref="IList{T}"/> of <see cref="FileInfo"/> that contains the files of the workstations, that will be affected by updating. </param>
		/// <exception cref="ArgumentNullException"> Throws an exception if any of the parameters was null. </exception>
		public BackupJob (IList<DirectoryInfo> workstations, IDictionary<DirectoryInfo, DirectoryInfo> backupFolders, IDictionary<DirectoryInfo, List<FileInfo>> affectedFiles)
		{
			this.Workstations = workstations ?? throw new ArgumentNullException(nameof(workstations));
			this.BackupFolders = backupFolders ?? throw new ArgumentNullException(nameof(backupFolders));
			this.AffectedFiles = affectedFiles ?? throw new ArgumentNullException(nameof(affectedFiles));
		}



		/// <inheritdoc/>
		public string GetJobOverview () => $"{this.GetType()}{this.GetHashCode()} [workstations=\"{this.Workstations}\", backups=\"{this.BackupFolders}\"]";



		/// <inheritdoc/>
		private string GetDebuggerDisplay () => this.ToString();



		/// <inheritdoc/>
		public override bool Equals (object obj) => base.Equals(obj);



		/// <inheritdoc/>
		public override int GetHashCode () => base.GetHashCode();



		/// <inheritdoc/>
		public override string ToString () => base.ToString();
	}
}